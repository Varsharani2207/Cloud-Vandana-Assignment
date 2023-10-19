function reverse() {

    var sentence=document.getElementById("sentence").value;
    var span=document.getElementById("spanResult");


    const words = sentence.split(' ');
    const reversedWords = [];

    for (const word of words) {
        const characters = word.split('');
        const reversedCharacters = [];

        while (characters.length > 0) {
            reversedCharacters.push(characters.pop());
        }

        reversedWords.push(reversedCharacters.join(''));
    }

    var result = reversedWords.join(' ');
    span.innerText="Reversed Sentence is : "+result;
}

