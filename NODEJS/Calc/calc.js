const express = require('express');
const server = express();
const parser = require('body-parser');

server.use(parser.json());

server.get('/calc/:operand/:num1/:num2', (req, res) => {
    let op = req.params.operand
    if (op == 'sum') {
        res.end(JSON.stringify({
            result: parseInt(req.params.num1) + parseInt(req.params.num2)
        }));

    } else if (op == 'sub')
        res.end(JSON.stringify({
            result: parseInt(req.params.num1) - parseInt(req.params.num2)
        }));
    else if (op == 'mul') {
        res.end(JSON.stringify({
            result: parseInt(req.params.num1) * parseInt(req.params.num2)
        }));
    } else if (op == 'div') {
        res.end(JSON.stringify({
            result: parseInt(req.params.num1) / parseInt(req.params.num2)
        }));
    }
});

server.post('/calculator', (req, res) => {
    res.setHeader('content-type', 'application/json');
    let op = req.body.operand
    if (op == 'sum') {
        res.end(JSON.stringify({
            result: parseInt(req.body.num1) + parseInt(req.body.num2)
        }))


    } else if (op == 'sub') {
        res.end(JSON.stringify({
            result: parseInt(req.body.num1) - parseInt(req.body.num2)
        }))

    } else if (op == 'mul') {
        res.end(JSON.stringify({
            result: parseInt(req.body.num1) * parseInt(req.body.num2)
        }))

    } else if (op == 'div') {
        res.end(JSON.stringify({
            result: parseInt(req.body.num1) / parseInt(req.body.num2)
        }))

    }

})
const PORT = 1224;
server.listen(PORT, () => {
    console.log(`Server started at ${PORT}`);
})