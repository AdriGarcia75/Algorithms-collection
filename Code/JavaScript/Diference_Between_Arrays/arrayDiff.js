function arrayDiff(a, b) {
    // This will output a new array that includes only the terms included in 'b' that appear in 'a'
    let output = [];
    a.forEach(num => {
        if (!b.includes(num)) output.push(num);
    });
    return output;
}