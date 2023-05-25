package com.idklol.jotaro.Assets.BaseData

import com.idklol.jotaro.Models.Workout

// Stores the JSON data (as a String) for the default Workout list
data class DefaultWorkouts(val dummyStringIgnore: String? = null ) {
    // data
    private val _workoutDataAsString = """
        [
            {
                "workout_id": 1,
                "title": "Isometric Quick Workout",
                "desc": "Short workout that focuses on the Isometric area of body",
                "exercises": [
                    "0001",
                    "0002",
                    "0027"
                ],
                "notes": [
                    "Quick workout with isometric focused-exercises",
                    "Use just with body"
                ]
            },
            {
                "workout_id": 2,
                "title": "Compound Quick Workout",
                "desc": "Workout that's Fast, focus on Compound area.",
                "exercises": [
                    "0025",
                    "0042",
                    "0138",
                    "0162"
                ],
                "notes": [
                    "Quick workout with compound-focused exercises"
                ]
            },
            {
                "workout_id": 3,
                "title": "Compound & Isolation Workout",
                "desc": "A small sample workout that uses exercises that utilize on both Compound and Isolation - NOW THIS IS SOME RANDOM EXTRA TEXT TO TEST THE OVERFLOW",
                "exercises": [
                    "0256",
                    "0264",
                    "0265"
                ],
                "notes": [
                    "Quick sample workout that has both Compound-Isometric hybrid exercises",
                    "Is there any way to improve this workout??"
                ]
            }
        ]
    """.trimIndent()

    // getter
    val defaultWorkouts: String
        get() = _workoutDataAsString
}
