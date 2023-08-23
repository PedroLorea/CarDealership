CREATE TABLE Car (
    id SERIAL PRIMARY KEY,
    marca TEXT NOT NULL,
    modelo TEXT NOT NULL,
    imagem TEXT,
    preco INTEGER NOT NULL
);