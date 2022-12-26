const questionCounterElement = document.querySelector('.question-counter');
const questionElement = document.querySelector('.question');
const answersElements = document.querySelectorAll('.answer');
const resultWindowElement = document.querySelector('.result-window');
const finishButtonElement = document.querySelector('.finish');
const questionCount = 5;

let randomQuestion;
let questionCounter = 0;
let rightAnswersCounter = 0;

function getRandomInt(min, max) {
    min = Math.ceil(min);
    max = Math.floor(max);
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

function getRandomQuestion() {
    const operandsCount = getRandomInt(2, 3);
    let equation = [];
    for (let i = 0; i < operandsCount; ++i) {
        let randomOperand = getRandomInt(1, 99);
        equation.push(randomOperand);
        let randomOperator = getRandomInt(0, 1) === 0 ? '+' : '-';
        equation.push(randomOperator);
    }
    equation.pop();
    return {
        question: equation.join(' ') + ' = ...',
        answer: eval(equation.join(' '))
    }
}

function updateQuestion() {
    if (questionCounter < questionCount) {
        questionCounterElement.textContent = String(++questionCounter) + '/' + String(questionCount);
        randomQuestion = getRandomQuestion();
        questionElement.textContent  = randomQuestion.question;
        const wrongAnswers = [];
        for (let i = 0; i < 4; ++i) {
            wrongAnswers.push(getRandomInt(randomQuestion.answer - 50, randomQuestion.answer + 50))
        }
        wrongAnswers[getRandomInt(0, 3)] = randomQuestion.answer;   
        for (let i = 0; i < 4; ++i) {
            answersElements[i].textContent = wrongAnswers[i];
        }
    } else {
        showResult();
    }
}

function selectAnswer(event) {
    if (event.target.textContent == randomQuestion.answer) {
        ++rightAnswersCounter;
        event.target.classList.toggle('right-answer');
        setTimeout(() => {
            event.target.classList.toggle('right-answer')
            setTimeout(updateQuestion(), 500)}, 500);
    } else {
        event.target.classList.toggle('wrong-answer');
        setTimeout(() => {
            event.target.classList.toggle('wrong-answer')
            setTimeout(updateQuestion(), 500)}, 500);
    }
}

function showResult() {
    resultWindowElement.classList.toggle('show-window');
    document.querySelector('.result-window p').textContent = 'Ты прошёл тест на ' + questionCounter + '/' + questionCount + '!';
    updateQuestion();
}

for (let e of answersElements) {
    e.onclick = selectAnswer;
}

updateQuestion();
resultWindowElement.onclick = () => resultWindowElement.classList.toggle('show-window');
finishButtonElement.onclick = showResult;