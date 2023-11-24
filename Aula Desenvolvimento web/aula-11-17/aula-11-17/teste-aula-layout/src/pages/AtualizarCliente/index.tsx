import { TextField } from "@mui/material";
import './index.css';

 
const AtualizarCliente = () => { 
    return <>
        <div className="body">
            <div className="box">
                <div className="box-input">
                    <TextField 
                     fullWidth 
                     variant="outlined" 
                     label="ID" />
                </div>
                <div className="box-input">
                    <TextField
                     fullWidth
                     variant="outlined"
                     label="Nome" />
                </div>
            </div>
        </div>
    </>
}

export default AtualizarCliente;