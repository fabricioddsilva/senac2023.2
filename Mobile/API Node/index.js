const express = require("express")

const server = express()

server.get('/usuario', (request,response) => {
    return response.send("Teste")
})

server.listen(3000)

