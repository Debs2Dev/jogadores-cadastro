// src\components\ListaDeJogadores\index.js

import { useState, useEffect } from "react";
import axios from "axios";
import './styles.css'

function ListaDeJogadores() {
    const [jogadores, setJogadoress] = useState([])

    useEffect(() => {
        const carregarJogadores = async () => {
            try {
                const response = await axios.get('http://localhost:8080/jogadores')
                setJogadores(response.data)
            } catch (error) {
                alert('Erro ao buscar jogador: ', error)
                setJogadores([])
            }
        }
        carregarJogadores()
    }, [])

    return (
        <ul id="listaJogadores" className="lista-jogadores">
            {jogador.length === 0 ? (
                <li>Nenhum jogador encontrado.</li>
            ) : (
                jogadores.map( jogador => (
                    <li key={jogadores.id}>
                        <strong>Nome: </strong> {jogador.nome}<br />
                        <strong>Sexo: </strong> {jogador.sexo}<br />
                        <strong>Idade: </strong> {jogador.idade}   
                        <strong>Altura: </strong> {jogador.altura}<br />
                        <strong>Peso: </strong> {jogador.peso}<br />
                        <strong>Posição: </strong> {jogador.posicao}<br />
                        <strong>Número da Camisa: </strong> {jogador.numeroCamisa}<br />
       
                    </li>
                ))
            )}
        </ul>
    )
    
}

export default ListaDeJogadores