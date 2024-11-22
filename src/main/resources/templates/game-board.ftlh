<DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial scale=1.0">
    <title> СУНДУК ВОЙНЫ доска</title>
    <style>
        .board {
            display: grid;
            grid-template-columns: repeat(8, 50px);
            grid-template-rows: repeat(8, 50px);
            gap: 1px;
            margin: 20px auto;
        }
        .cell {
            width: 50px;
            height: 50px;
            display: flex;
            justify-content: center;
            align-items: center;
            cursor: pointer;
        }
        .cell:nth-child(even) {
            background-color: #f0d9b5;
        }
        .cell:nth-child(odd) {
            background-color: #b58863;
        }
        .cell:hover {
            background-color: #ffeb3b;
        }
    </style>
</head>
<body>

    <h1>Доска</h1>
    <div class="board">
        <#list 0..7 as row>
            <#list 0..7 as col>
                <div class="cell" onclick="showCoordinates(${row}, ${col})">
                    ${row}, ${col}
                </div>
            </#list>
        </#list>
    </div>

    <p id="coordinates"> Координаты: </p>

    <script>
        function showCoordinates(row,col) {
            document.getElementById("coordinates").innerText = "Координаты: (" + row + ", " + col + ")";
        }
    </script>
</body>
</html>



</body>
