let count = 0;
let x = [0, 0, 0, 0, 0, 0, 0, 0, 0]

function start() {
    document.getElementById("0").disabled = false;
    document.getElementById("1").disabled = false;
    document.getElementById("2").disabled = false;
    document.getElementById("3").disabled = false;
    document.getElementById("4").disabled = false;
    document.getElementById("5").disabled = false;
    document.getElementById("6").disabled = false;
    document.getElementById("7").disabled = false;
    document.getElementById("8").disabled = false;
}

function update(j) {
    if (count % 2 == 0) {
        document.getElementById(j).value = "x";
        count = count + 1;
        x[j] = 1;
        check(x)
    } else {
        document.getElementById(j).value = "o";
        localStorage.setItem(j, 'o')
        count = count + 1;
        x[j] = 2;
        check(x)
    }
}

function check(x) {
    if (x[0] != 0 && x[0] == x[1] && x[1] == x[2]) {
        document.getElementById('game').innerHTML = "game won by" + x[0]
        disable()
    } else if (x[3] != 0 && x[3] == x[4] && x[4] == x[5]) {
        document.getElementById('game').innerHTML = "game won by" + x[3]
        disable()
    } else if (x[6] != 0 && x[6] == x[7] && x[7] == x[8]) {
        document.getElementById('game').innerHTML = "game won by" + x[6]
        disable()
    } else if (x[0] != 0 && x[0] == x[3] && x[3] == x[6]) {
        document.getElementById('game').innerHTML = "game won by" + x[0]
        disable()
    } else if (x[1] != 0 && x[1] == x[4] && x[4] == x[7]) {
        document.getElementById('game').innerHTML = "game won by" + x[1]
        disable()
    } else if (x[2] != 0 && x[2] == x[5] && x[5] == x[8]) {
        document.getElementById('game').innerHTML = "game won by" + x[2]
        disable()
    } else if (x[0] != 0 && x[0] == x[4] && x[4] == x[8]) {
        document.getElementById('game').innerHTML = "game won by" + x[0]
        disable()
    } else if (x[2] != 0 && x[2] == x[4] && x[4] == x[6]) {
        document.getElementById('game').innerHTML = "game won by" + x[2]
        disable()
    }
}

function disable() {
    document.getElementById("0").disabled = true;
    document.getElementById("1").disabled = true;
    document.getElementById("2").disabled = true;
    document.getElementById("3").disabled = true;
    document.getElementById("4").disabled = true;
    document.getElementById("5").disabled = true;
    document.getElementById("6").disabled = true;
    document.getElementById("7").disabled = true;
    document.getElementById("8").disabled = true;

}