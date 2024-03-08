CREATE TABLE drinkingRegime
(
    id IDENTITY,
    dateOfEntry DATE         NOT NULL,
    timeOfEntry TIME         NOT NULL,
    drink       VARCHAR(20) CHECK (drink IN ('WATER', 'COFFEE', 'TEA', 'SWEETENED_DRINK')) NOT NULL,
    quantity    INT          NOT NULL,
    sport       BOOLEAN      NOT NULL

);

CREATE INDEX ON drinkingRegime(dateOfEntry);