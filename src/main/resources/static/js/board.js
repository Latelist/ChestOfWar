const canvas = document.getElementById('hexagonCanvas');
const ctx = canvas.getContext('2d'); //?

function drawHexagon(x, y, size) {
    const vertices = {};
    ctx.beginPath();
    for (let i = 0; i < 6; i++) {
        const angle = (i * 2 * Math.PI) / 6
        const xPos = x + size * Math.cos(angle);
        const yPos = y + size * Math.sin(angle);
        vertices[`vertex_${i + 1}`] = {x: xPos, y: yPos};
        if (i===0) {
            ctx.moveTo(xPos, yPos);
        } else {
            ctx.lineTo(xPos, yPos);
        }
        lastXPos = xPos;
        lastYPos = yPos;
    }


    ctx.closePath();
    ctx.fillStyle = '#4CAF50';
    ctx.fill();
    ctx.stroke();

    ctx.fillStyle = '#FF0000';  // Красный цвет для точки
    ctx.beginPath();
    ctx.arc(lastXPos, lastYPos, 5, 0, 2 * Math.PI); // Рисуем точку радиусом 5
    ctx.fill();

    return vertices;
}

let vertices = drawHexagon(150, 150, 50);
const rightUpperVertex = vertices['vertex_6'];
const
