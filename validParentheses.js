let s = "{()[[]]{}}"

function isValid(s) {
    let stack = [];
    let c;

    if(s.length % 2 !== 0) 
        return false;

    for(c of s){
        if (c === "(" || c === "[" || c === "{") {
            stack.push(c);
        } else {
            if (c === ")" && stack[stack.length - 1] === "(") {
                stack.pop();
            } else if (c === "]" && stack[stack.length - 1] === "[") {
                stack.pop();
            } else if (c === "}" && stack[stack.length - 1] === "{") {
                stack.pop();
            } else {
                return false;
            }
        } 
    }

    return stack.length === 0 ? true : false;
}

console.log(isValid(s))
