const client = require('mongodb').MongoClient;
const userDetails = require('../db/userDetails').userDetails;

class UserService {
    addUser(_user, callback) {
        const _url = userDetails.mongo.url + userDetails.mongo.port;
        client.connect(_url, (err, connection) => {
            connection.db(userDetails.mongo.db)
                .collection(userDetails.mongo.collections.user)
                .insert(_user, (err, response) => {
                    callback(err, response)
                });
        });
    }
}


module.exports.UserService = UserService;