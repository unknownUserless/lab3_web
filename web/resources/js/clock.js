function startClock(){
    updateClock();
    setInterval(updateClock, 8000);
}

function updateClock() {
    let curDate = new Date();
    let weekDays = ["Вс", "Пн","Вт","Ср","Чт","Пт","Сб"];
    let hours = curDate.getHours().toString();
    let minutes = curDate.getMinutes().toString();
    let seconds = curDate.getSeconds().toString();
    if(hours.length === 1){
        hours = '0' + hours;
    }
    if(minutes.length === 1){
        minutes = '0' + minutes;
    }
    if(seconds.length === 1){
        seconds = '0' + seconds;
    }

    document.getElementById("time").innerText = hours + ":" + minutes + ":" + seconds;
    document.getElementById("date").innerText = weekDays[curDate.getDay()] +
        ", " + curDate.getDate() + "." + (curDate.getMonth()+1) + "." + curDate.getFullYear();
}