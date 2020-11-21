// Configuration Test:
console.log('connection successful');

// Initial Configurations:
$('#add-lang').hide();
$('#random-kata').hide();
$('#cancel-button').hide();

$('#add-button').click(function () {
    $('#add-lang').slideDown();
    $('#add-button').hide();

    $('#cancel-button').show();
});


$('#cancel-button').click(function () {
    $('#add-lang').slideUp();
    $('#cancel-button').hide();
    $('#add-button').show();
})

$('#submit-lang').click(function () {
    const newKataLang = $('#languageToAdd').val();

    // append to list
    $('kata-lang').text(newKataLang);
})

// Randomize Action:

// https://attacomsian.com/blog/javascript-dom-get-all-child-nodes-of-an-element

const ul = document.querySelector('#languages');

const children = ul.children;

const h4 = document.querySelector('kata-chosen');

$('#randomize').click(function () {
    $('#languages-bx').hide();
    let LanguagesFromDOM = Array.from(children);
    let RandomKataPool = [];
    let count = 0;
    let Random_Kata = "";

    LanguagesFromDOM.forEach(child => {
        if (child.innerHTML) {
            // console.log(child.innerHTML);
            RandomKataPool.push(child.innerHTML);
            count++;
        }
    })

    console.log(`Languages in The Array: ${count}`);

    // Check Contents
    // RandomKataPool.forEach(element => {
    //     console.log(element);
    // })


    // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random

    // get random value
    let randomNumber = Math.floor(Math.random() * Math.floor(count));

    // show the random kata
    $('#kata-chosen').text(RandomKataPool[randomNumber]);


    $('#random-kata').show()
});

$('#close-btn').click(function () {
    $('#random-kata').hide();
    $('#languages-bx').show();
})