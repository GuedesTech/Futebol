ROLLBACK;
BEGIN;

ALTER TABLE "jogador"
    ADD CONSTRAINT fk_jogador_time
        FOREIGN KEY ("id_time")
            REFERENCES "time" ("id_time")
            ON DELETE SET NULL
            ON UPDATE CASCADE;

ALTER TABLE "partida"
    ADD CONSTRAINT fk_partida_time_casa
        FOREIGN KEY ("id_time_casa")
            REFERENCES "time" ("id_time")
            ON DELETE CASCADE
            ON UPDATE CASCADE;

ALTER TABLE "partida"
    ADD CONSTRAINT fk_partida_time_visitante
        FOREIGN KEY ("id_time_visitante")
            REFERENCES "time" ("id_time")
            ON DELETE CASCADE
            ON UPDATE CASCADE;

COMMIT;
