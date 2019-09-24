const EventEmitter = require('events').EventEmitter;
const det = new EventEmitter();

class Detect {
    _detect(age) {
        if (age < 18) {
            return "Juvenile";
        } else if (age >= 18) {
            return "Adult";
        }

    }
}

class Listener {
    _listen(req) {
        let _var = req;
        const _call = new Detect();
        let ans = _call._detect(_var);
        console.log(ans);
    }

}

const _test = new Listener();
det.addListener('AgeListener', _test._listen)

module.exports = {
    emitDetect: det
}