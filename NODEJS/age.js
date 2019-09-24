const emitter = require('./det').emitDetect;
let _var = process.argv[2]
emitter.emit('AgeListener', _var)