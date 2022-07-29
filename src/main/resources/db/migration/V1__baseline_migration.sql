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