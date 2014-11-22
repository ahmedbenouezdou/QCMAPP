CREATE TABLE question (
  id       INTEGER,
  titre    VARCHAR(2048),
  multiple BIT
);

CREATE TABLE reponse (
  id          INTEGER,
  titre       VARCHAR(2048),
  bonne       BIT,
  question_id INTEGER
)