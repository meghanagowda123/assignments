interface Employee {
    name : string;
    id : number;
}

let e1 : Employee = {
    name : "Meghana",
    id : 101
}

function print (employee : Employee) {
    console.log(employee.id + ", "+employee.name);
}

print(e1);

interface Cosmetic {
    name : string;
    id : number;
    price : number;
}

let c1 : Cosmetic = {
    name : "Aloe Vera Gel",
    id : 201,
    price : 500
}

print(c1);          



