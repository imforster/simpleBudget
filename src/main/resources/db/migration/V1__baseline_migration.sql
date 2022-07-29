create TABLE deposits (
  id INT NOT NULL,
   status VARCHAR(255) NOT NULL,
   date timestamp NULL,
   `description` VARCHAR(255) NOT NULL,
   category VARCHAR(64) NOT NULL,
   amount DECIMAL(5, 2) NOT NULL,
   account VARCHAR(255) NULL,
   reoccurring BIT(1) NULL,
   reoccuring BIT(1) NULL,
   CONSTRAINT PK_DEPOSITS PRIMARY KEY (id)
);

create TABLE expenses (
  id INT NOT NULL,
   status VARCHAR(128) NOT NULL,
   date timestamp NULL,
   `description` VARCHAR(255) NOT NULL,
   category VARCHAR(64) NOT NULL,
   amount DECIMAL(5, 2) NULL,
   account VARCHAR(255) NOT NULL,
   reoccurring BIT(1) NULL,
   reoccuring BIT(1) NULL,
   CONSTRAINT PK_EXPENSES PRIMARY KEY (id)
);

create TABLE flyway_schema_history (
  installed_rank INT NOT NULL,
   version VARCHAR(50) NULL,
   `description` VARCHAR(200) NOT NULL,
   type VARCHAR(20) NOT NULL,
   script VARCHAR(1000) NOT NULL,
   checksum INT NULL,
   installed_by VARCHAR(100) NOT NULL,
   installed_on timestamp DEFAULT NOW() NOT NULL,
   execution_time INT NOT NULL,
   success BIT(1) NOT NULL,
   CONSTRAINT PK_FLYWAY_SCHEMA_HISTORY PRIMARY KEY (installed_rank)
);

create index flyway_schema_history_s_idx on flyway_schema_history(success);