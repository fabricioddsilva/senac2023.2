//Config Inicial
const express = require ('express');
const mongoose = require ('mongoose')
const app = express();

//Metodo para ler JSON
app.use(
    express.urlencoded({
        extended: true
    })
)

app.use(express.json())

//Rotas
const personRoutes = require('./routes/personRoutes')

app.use('/person', personRoutes)

//Rota Inicial
app.get('/', (req,res) => {
    
    res.json({msg: 'Ola!'})
})

//Conexão
mongoose.connect('mongodb+srv://fabricio:YcNJWOkAvgxDjOSs@cluster0.5seesso.mongodb.net/?retryWrites=true&w=majority')
.then(() => {
    console.log('MongoDB Conectado')
    app.listen(3000) 
})
.catch((err) => console.log(err))

