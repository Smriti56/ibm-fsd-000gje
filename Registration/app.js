const express = require('express');
const server = express();
const parser = require('body-parser');
const cors = require('cors');

const userRoutes = require('./routes/user').userRoutes;

server.use(parser.json());
server.use(cors());

server.use('/user', userRoutes);

const POrt = 9876;
server.listen(POrt, (rq, rs) => {
    console.log(`server is running at ${POrt}`)

})