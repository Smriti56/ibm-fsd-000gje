const EventEmitter = require('events').EventEmitter;
const det = new EventEmitter();

class Detect {
    _detect(legs) {
        if (legs != 2) {
            console.log("Animal");
        } else {
            console.log("Human");
        }

    }
}


const _test = new Detect();
det.addListener('AgeListener', _test._detect)

module.exports = {
    emitDetect: det
}