import React from "react";

function ListofPlayers() {
  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 85 },
    { name: "Gill", score: 76 },
    { name: "Rahul", score: 68 },
    { name: "Hardik", score: 88 },
    { name: "Jadeja", score: 60 },
    { name: "Ashwin", score: 72 },
    { name: "Bumrah", score: 55 },
    { name: "Shami", score: 80 },
    { name: "Siraj", score: 45 },
    { name: "Kuldeep", score: 90 }
  ];

  const below70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>List of Players</h2>

      <h3>All Players</h3>

      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h3>Players with Score below 70</h3>

      <ul>
        {below70.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;