

var firstwords = new Array("Invation","Curse","Revenge","War","House","Night","Return","Battle","Horror","Terror","Apocalypse","Army","Wrath","Dawn","Rising","Anger","Rage","Bride","Attack","Tomb");

var attributes = new Array("Gigantic","Mad","Evil","Dead","Haunted","Damned","Swamp","Forest","Murderous","Flesh-eating","Mountain","Huge","Armed","Killer","Colossal","Lake","Ancient","Mutant","Devil","Demon","Extraterrestrial","","Space","Robot","Immortal","Nazi","Undead","Dark","Sex","Mega","Terrorist","Vampire","Antimatter","Time Traveling","Man-eating","Cursed","Bloodthirsty","Ice Cream","Roller Blade","Russian");

var lastwords = new Array("Giant","Giants","Beast","Beasts","Monster","Monsters","Zombie","Zombies","Men","People","Woman","Women","Ape","Apes","Gorilla","Gorillas","Lizard","Lizards","Alien","Aliens","Thing","Creature","Creatures","Monkey","Monkeys","Witch","Witches","Goblin","Goblins","Troll","Trolls","Wizard","Wizards","Clown","Clowns","Spider","Spiders","Shark","Sharks","Fish","Ghost","Ghosts","Elf","Elves","Worm","Worms","Dinosaur","Dinosaurs","Dragon","Dragons","Corpse","Corpses","Bird","Birds","Hands","Mummy","Brain","Teenagers","Maniac","Werewolf","Cowboys","Snake","Snakes","Buzzard","Octopus","Santa Claus","Bunny","Bunnies","Boogieman","Skeleton","Skeletons");

var places = new Array("from Hell","from Space","from the Sky","from the Future","from Outer Space","from Mars","from Another Planet","from the Center of the Earth","from the North","from the Deep","","","","","","","");

var sources = new Array("of Doom","of Death","of Fate","with two Heads","that conquered the Earth","that wouldn't die","of Satan","on a plane","that Ruled the World");

var singulars = new Array("Giant","Beast","Monster","Zombie","Gorilla","Lizard","Alien","Ape","Thing","Creature","Monkey","Witch","Goblin","Troll","Wizard","Clown","Spider","Shark","Fish","Ghost","Elf","Worm","Dinosaur","Dragon","Corpse","Bird","Mummy","Maniac","Werewolf","Snake","Buzzard","Octopus","Skeleton");

var people = new Array("I","He","She","My Grandmother","My Babysitter","My Grandfather","My Neighbour","My Teacher","My Mother","My Girlfriend","My Boyfriend");

function retrieve() {
    var type = Math.floor(Math.random()*4)
    var word1,word2,word3,word4,result
    if (type == 0) {
        word1 = firstwords[Math.floor(Math.random()*firstwords.length)];
        word2 = attributes[Math.floor(Math.random()*attributes.length)];
        word3 = lastwords[Math.floor(Math.random()*lastwords.length)];
        word4 = places[Math.floor(Math.random()*places.length)];	
        result = word1.trim()+" of the "+word2.trim()+' '+word3.trim()+' '+word4.trim();
    }
    else if (type == 1)
    {
        word1 = attributes[Math.floor(Math.random()*attributes.length)];
        word2 = lastwords[Math.floor(Math.random()*lastwords.length)];
        word3 = attributes[Math.floor(Math.random()*attributes.length)];
        word4 = lastwords[Math.floor(Math.random()*lastwords.length)];
        word5 = places[Math.floor(Math.random()*places.length)];	
        result = word1.trim()+" "+word2.trim()+" vs "+word3.trim()+" "+word4.trim()+" "+word5.trim();
    }
    else if (type == 2)
    {
        word1 = attributes[Math.floor(Math.random()*attributes.length)];
        word2 = lastwords[Math.floor(Math.random()*lastwords.length)];
        word3 = sources[Math.floor(Math.random()*sources.length)];
        result = 'The '+word1.trim()+' '+word2.trim()+' '+word3.trim();
    }	
    else
    {
        word1 = attributes[Math.floor(Math.random()*attributes.length)];
        word2 = singulars[Math.floor(Math.random()*singulars.length)];
        word3 = people[Math.floor(Math.random()*people.length)];	
        if (word1[0] == 'A' || word1[0] == 'E' || word1[0] == 'I' || word1[0] == 'O' || word1[0] == 'U') {
            result = 'The Night '+word3+' became an '+word1+' '+word2;
        } else {
            result = 'The Night '+word3+' became a '+word1+' '+word2;
        }
    }
    return result
}

var genre=["Action","Drama","Horror","Comedy","Romance","Science Fiction"]

for (i = 0; i < 1000; i++) {
    var g = Math.floor(Math.random()*genre.length)
    var rating = Math.random()*5
    var relations = 5 + Math.floor(Math.random()*30)
   
    var line = retrieve().trim()+","+genre[g]+","+rating.toFixed(2)
    for (x = 0; x < relations; x++) 
        line += "," + Math.floor(Math.random()*1000)
    console.log(line)
}

