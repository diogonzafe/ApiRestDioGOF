CREATE TABLE Endereco (

    cep TEXT PRIMARY KEY NOT NULL,
    logradouro TEXT NOT NULL,
    complemento TEXT,
    bairro TEXT NOT NULL,
    localidade TEXT NOT NULL,
    uf TEXT NOT NULL,
    ibge TEXT,
    gia TEXT,
    ddd TEXT NOT NULL,
    siafi TEXT,
    id TEXT REFERENCES Clientes (id)
);



