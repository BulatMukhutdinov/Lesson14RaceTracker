package tat.mukhutdinov.lesson14racetracker

import tat.mukhutdinov.lesson14racetracker.ui.RaceParticipant

class RaceParticipantTest {
    private val raceParticipant = RaceParticipant(
        name = "Test",
        maxProgress = 100,
        progressDelayMillis = 500L,
        initialProgress = 0,
        progressIncrement = 1
    )
}
