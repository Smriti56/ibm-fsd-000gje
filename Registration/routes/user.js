const routes = require('express').Router();
const UserService = require('../services/userService').UserService;
const uService = new UserService();

routes.post('/register', (rq, rs) => {
    uService.addUser(rq.body, (req, res) => {
        rs.status(200).json({
            message: 'user registered  successfully!'
        })
    })
})


module.exports.userRoutes = routes;