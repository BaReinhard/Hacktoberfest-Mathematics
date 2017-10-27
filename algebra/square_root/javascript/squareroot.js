/*
* Created For DigitalOcean's Hacktoberfest!
* A QUICK AND APPROXIMATE SQUARE ROOT PROGRAM
*/

function quickroot(num) {
  let i = 0;

  while (true) {
    if (num < i * i) {
      let closestsquare = (i - 1) * (i - 1);
      let difference = num - closestsquare;
      let root = i - 1 + difference / (2 * num);
      return root;
    }
    i += 1;
  }
}
