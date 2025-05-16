const person = {
    name : "Rahul",
    age : 33,
    address : {
        city : "Gurgaon",
        state : "Haryana",
        country : "India"
    },
    profiles : ["github", "linkedin"],
    printProfile: () => {
        console.log(person.name + " -> " + person.profiles[1])
    }
}


export default function JavascriptPrimer() {
    return (
        <div>
            <div>{person.name}</div>
            <div>{person.address.city}</div>
            <div>{person.profiles[0]}</div>
            <div>{person.printProfile()}</div>
        </div>
    )
}