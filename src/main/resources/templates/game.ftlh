<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale = 1.0">
    <title>СУНДУК ВОЙНЫ</title>
</head>

<body>
Здарова, щегол! Здесь будет сундук войны)
    <h1> Инфа про юнита </h1>
    <p> Имя: ${unit.name} </p>
    <p> Дальность хода: ${unit.move} </p>
    <p> Запас жизни: ${unit.live} </p>
    <p> Состояние: ${unit.state} </p>
    <p> Текущее расположение: (${unit.coordinates[0]}, ${unit.coordinates[1]}) </p>

    <form action="/game-board" method="get">
        <button type="submit">К игре</button>
    </form>

</body>
</html>