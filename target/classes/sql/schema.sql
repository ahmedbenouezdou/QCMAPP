CREATE TABLE question (
  id       INTEGER IDENTITY PRIMARY KEY,
  titre    VARCHAR(2048) NOT NULL,
  multiple BIT NOT NULL
);

CREATE TABLE reponse (
  id          INTEGER IDENTITY PRIMARY KEY NOT NULL ,
  titre       VARCHAR(2048) NOT NULL ,
  bonne       BIT NOT NULL ,
  question_id INTEGER NOT NULL
);

CREATE TABLE qcm (
  id          INTEGER IDENTITY PRIMARY KEY NOT NULL ,
  titre       VARCHAR(2048) NOT NULL
 );

CREATE TABLE qcm_question(
  id_qcm INTEGER,
  id_question INTEGER
)