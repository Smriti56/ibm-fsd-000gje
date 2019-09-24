const Email = require('./email').Email;
const utils = require('./utils').utils;
const emailService = new Email();

class Service {
    email(user) {
        let userOj = {
            subject: "User Registration",
            body: "Thank you for registraation",
            from: null,
            to: user.email

        }
        emailService.emailWithAttachment(userOj);
    }


}