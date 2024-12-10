const canvas = document.getElementById("hexCanvas");
const ctx = canvas.getContext("2d");

const canvasWidth = canvas.width;
const canvasHeight = canvas.height;

const centerX = canvasWidth / 2;
const centerY = canvasHeight / 2;

const hexRadius = 50;  // радиус шестиугольника

const hexagons = [
    { x: 0, y: 0 },
    { x: 1, y: 0 },
    { x: 0, y: 1 },
    { x: 1, y: 1 },
    { x: 2, y: 0 },
    { x: 2, y: 1 },
    { x: 1, y: 2 },
    // Добавьте сюда больше шестиугольников по вашему требованию
];



// Функция для вычисления позиции шестиугольников по координатам на канвасе
function countTheShift(x, y) {
    const width = hexRadius * 2;  // ширина шестиугольника
    const height = hexRadius * Math.sqrt(3);            // высота шестиугольника

    // Вычисляем смещения для положения шестиугольников
    const px = x * width * 3 / 4 + centerX;  // смещение по X
    const py = y * height + (x % 2) * (height / 2) + centerY;  // смещение по Y (сдвиг на четные строки)

    return { x: px, y: py };
}

function drawHexagon(x, y, size) {
    ctx.beginPath();
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

function drawHexagonGrid(hexagons) {
    for (let i = 0; i < hexagons.length; i++) {
        const hex = hexagons[i];
        const pixel = countTheShift(hex.x, hex.y);
        drawHexagon(pixel.x, pixel.y, hexRadius);
    }
}

drawHexagonGrid(hexagons);

