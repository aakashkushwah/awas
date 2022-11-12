create sequence if not exists user_id_seq_gen start 1;

CREATE TABLE IF NOT EXISTS "user"
(
    user_id integer NOT NULL constraint user_pkey primary key,
    first_name character varying COLLATE pg_catalog."default",
    last_name character varying COLLATE pg_catalog."default",
    preferred_name character varying COLLATE pg_catalog."default",
    address character varying COLLATE pg_catalog."default",
    phone character varying COLLATE pg_catalog."default",
    age integer,
    role_id integer,
    email character varying COLLATE pg_catalog."default",
    remarks character varying COLLATE pg_catalog."default"
)
