import React, { useState } from "react";
import logo from "./logo.svg";
import "./App.css";
import { DataGrid, GridColDef } from "@mui/x-data-grid";
import {
  Button,
  Dialog,
  DialogActions,
  DialogContent,
  DialogTitle,
  TextField,
} from "@mui/material";

function App() {
  const [openCadastro, setOpenCadastro] = useState<boolean>(false);
  const [id, setId] = useState<string>();
  const [nome, setNome] = useState<string>();
  const [linha, setLinha] = useState<any[]>([]);

  const colunas: GridColDef[] = [
    {
      field: "id",
      headerName: "ID",
      width: 20,
    },
    {
      field: "nome",
      headerName: "NOME",
      width: 150,
    },
  ];

  const linhas = [
    { id: 1, nome: "Douglas" },
    { id: 2, nome: "Junior" },
    { id: 3, nome: "Aleatorio" },
    { id: 4, nome: "Aleatorio2" },
  ];

  const closeCadastro = () => {
    setOpenCadastro(false);
  };

  const onSalvarCliente = () => {
    const _linha: any[] = [...linha];
    linha.push({
      id: Number(id),
      nome: nome || "",
    });

    setLinha(_linha);
  };

  return (
    <div style={{ maxWidth: "100%" }}>
      <header style={{ display: "flex" }}>
        <div style={{ display: "flex", width: "100%", padding: "27px" }}>
          <h1>
            <img
              style={{ display: "block", width: "100px", height: "59px" }}
              src="./log-senac.png"
            />
          </h1>
          <div
            style={{
              display: "flex",
              alignItems: "center",
              justifyContent: "center",
              width: "100%",
            }}
          >
            <p style={{ fontSize: "35px", color: "#004587" }}>App Layout</p>
          </div>
        </div>
      </header>
      <div
        style={{
          display: "flex",
          backgroundImage: "url(http://localhost:3000/slide_senac.jpg)",
          height: "200px",
          backgroundSize: "cover",
          alignItems: "center",
          padding: "40px",
        }}
      >
        <p style={{ color: "white", fontSize: "24px" }}>Senac</p>
      </div>
      <div style={{ display: "flex", padding: "5px" }}>
        <Button
          variant="contained"
          onClick={() => {
            setOpenCadastro(true);
          }}
        >
          Adicionar Cliente
        </Button>
      </div>
      <div style={{ display: "flex" }}>
        <DataGrid
          rows={linha}
          columns={colunas}
          checkboxSelection
          initialState={{
            pagination: {
              paginationModel: {
                pageSize: 5,
              },
            },
          }}
        />
      </div>
      <Dialog open={openCadastro} onClose={closeCadastro}>
        <DialogTitle>Tela de cadastro</DialogTitle>
        <DialogContent>
          <div style={{ width: "100%" }}>
            <TextField
              margin="dense"
              fullWidth
              variant="outlined"
              label="ID"
              onChange={(texto) => {
                setId(texto.target.value);
              }}
            />
          </div>
          <div style={{ width: "100%" }}>
            <TextField
              margin="dense"
              fullWidth
              variant="outlined"
              label="Nome"
              onChange={(texto) => {
                setNome(texto.target.value);
              }}
            />
          </div>
        </DialogContent>
        <DialogActions>
          <Button
            variant="contained"
            onClick={() => {
              onSalvarCliente();
            }}>Salvar</Button>
        </DialogActions>
      </Dialog>
    </div>
  );
}

export default App;
