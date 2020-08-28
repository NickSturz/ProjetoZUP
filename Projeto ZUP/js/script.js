var mysql = require('mysql');

var con = mysql.createConnection({
  host: "root",
  password: "041923"
});

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
});