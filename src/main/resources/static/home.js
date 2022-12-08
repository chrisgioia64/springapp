

async function loadData() {
    var requestOptions = {
      method: 'GET',
      redirect: 'follow'
    };

    const response = await fetch("http://localhost:8081/parts", requestOptions);
    let parts = await response.json();

    var tableRef = document.getElementById('table_data').getElementsByTagName('tbody')[0];


    for (let i = 0; i < parts.length; i++) {
        var newRow = tableRef.insertRow(tableRef.rows.length);
        let part = parts[i];
        var tr = "<tr>";
        id = "";
        if (part.id != null) {
            id = part.id;
        }
        tr += "<td class='col_id'>" + id +"</td>";
        tr += "<td class='col_name'>" + part.name + "</td>";
        tr += "<td class='col_price'>" + part.price + "</td>";
        tr += "</tr>";

        newRow.innerHTML = tr;
    }
}

window.onload = (event) => {
    console.log("finished loading page");
    loadData();
};
