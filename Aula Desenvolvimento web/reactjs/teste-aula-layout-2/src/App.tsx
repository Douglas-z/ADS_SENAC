import React from 'react';
import logo from './logo.svg';
import './App.css';
import { GridColDef } from '@mui/x-data-grid';
 
function App() {
  const colunas: GridColDef[] = [
    {
      field: "id", headerName: "ID", width: 20,
    },
    {
      field: "nome", headerName: "Nome", width: 150,
    }
  ]
 
  const linhas = [
    {id: 1, nome: "Pam"}
    {id: 2, nome: "Jucá"}
  ]
 
 
  return (
   <div style={{maxWidth: "100%"}}>
    <header style={{display:"flex"}}>
      <div style={{display: "flex", width:"100%", padding:"27px"}}>
      <h1>
      <img style={{display:"block", width: "100px", height:"59px"}}src="./logo-senac-cnc-color-100.png" alt="Logo Senac"/>
      </h1>
      <div style={{display:"flex", alignItems:"center", justifyContent:"center", width: "100%"}}>
        <p style={{fontSize: "35px", color: "#004587",}}>
          App Layout
        </p>
        </div>
      </div>
    </header>
    <div style={{display: "flex", backgroundImage: "url(http://localhost:3000/slide_senac.jpg)", height:"200px", backgroundSize: "cover", alignItems:"center", padding: "0 40px"}}>
      <p style={{color:"white", fontSize: "27px"}}>
        Senac
      </p>
 
    </div>
    <div style={{display:"flex"}}>
      <DataGrid rows = {linhas} columns = {colunas} initialState={{}}>
       
      </DataGrid>
    </div>
 
   </div>
  );
}
 
export default App;
