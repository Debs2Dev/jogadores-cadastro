// src\pages\Lista\index.js

import ListaDeJogadores from '../../components/ListaDeJogadores'
import { useNavigate } from 'react-router-dom'
import './styles.css'

function PaginaListaJogadores() {
    const navigate = useNavigate()
    
return (
        <div className='pagina-lista-jogadores'>
            <div className='container'>
                <h2>Lista de Jogadores</h2>
                <ListaDeJogadores />
                <button onClick={() => navigate('/')} className='link-voltar'>
                    Cadastrar usuários
                </button>
            </div>
        </div>
    )
}

export default PaginaListaJogadores