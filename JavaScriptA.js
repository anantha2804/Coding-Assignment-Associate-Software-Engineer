const Sentence = prompt("Enter a sentence:");
const reverse = reverseWords(Sentence);
console.log(reverse);

function reverseWords(sentence) {
    let words = splitWords(sentence);
    let reversedWords = words.map(reverseString);
    return joinWords(reversedWords);
}

function splitWords(sentence) {
    let words = [];
    let currentWord = '';

    for (let char of sentence) {
        if (char === ' ') {
            words.push(currentWord);
            currentWord = '';
        } else {
            currentWord += char;
        }
    }

    words.push(currentWord);

    return words;
}

function reverseString(str) {
    let reversedStr = '';
    for (let i = str.length - 1; i >= 0; i--) {
        reversedStr += str[i];
    }
    return reversedStr;
}

function joinWords(words) {
    let joinedSentence = '';
    for (let i = 0; i < words.length; i++) {
        joinedSentence += words[i];
        if (i < words.length - 1) {
            joinedSentence += ' ';
        }
    }
    return joinedSentence;
}



