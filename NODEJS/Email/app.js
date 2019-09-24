const express = require('express');
const parser = require('body-parser');
const cors = require('cors');
const Email = require('./service/email').Email;

const server = express();
const emailService = new Email();


//apis
//const userApis = require('./apis/user').server;

server.use(parser.json());
server.use(cors());

server.post('/email', (rq, rs) => {
    emailService.email(rq.body);
    rs.status(200).json({
        message: 'Service is running'
    })
})




server.get('/status', (rq, rs) => {
    rs.status(200).json({
        message: 'Sever is running'
    });
});

//server.use('/user', userApis);

const PORT = 1234;
server.listen(PORT, () => {
    console.log(`Server is running at port ${PORT}`)
})