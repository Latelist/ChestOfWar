const canvas = document.getElementById('hexagonCanvas');
const ctx = canvas.getContext('2d'); //?

function drawHexagon(x, y, size) {
    ctx.beginPath(); //?
    for (let i = 0; i < 6; i++) {
        const angle = (i * 2 * Math.PI) / 6
        const xPos = x + size * Math.cos(angle);
        const yPos = y + size * Math.sin(angle);
        if (i===0) {
            ctx.moveTo(xPos, yPos);
        } else {
            ctx.lineTo(xPos, yPos);
        }
    }
    ctx.closePath();
    ctx.fillStyle = '#4CAF50';
    ctx.fill();
    ctx.stroke();
}

drawHexagon(150, 150, 100);