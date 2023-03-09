import React from 'react'
import ReactDOM from 'react-dom'

const data = [
    {name: "Instagram", class: "fa fa-instagram"},
    {name: "Facebook", class: "fa fa-facebook-f"},
    {name: "Twitter", class: "fa fa-twitter"},
    {name: "LinkedIn", class: "fa fa-linkedin"},
    {name: "Youtube", class: "fa fa-youtube"},   
    {name: "GitHub", class: "fa fa-github"}   
]

function App() {
    return(
        <section>
            <div className='wrapper'>
                <Button />
            </div>
        </section>
    )
}

function Button(){
    
        return(
            data.map(function(ele){
            return( 
            <div className="button">
                <div className='icon'>
                    <i className={ele.class}></i>
            </div>
            <span>{ele.name}</span>
            </div>
            )})
        )
}

const rootNode = document.getElementById('root')
ReactDOM.render(<App />, rootNode)