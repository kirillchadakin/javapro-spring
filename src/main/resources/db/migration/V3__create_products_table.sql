CREATE TABLE "products" (
    id SERIAL PRIMARY KEY,
    account_number CHARACTER VARYING(30),
    balance BIGINT,
    type CHARACTER VARYING(30),
    user_id BIGINT
);
