import { createSlice } from '@reduxjs/toolkit'

//action type
export const UPDATE_MOOD = "UPDATE_MOOD";
export const UPDATE_SIZE = "UPDATE_SIZE";
export const UPDATE_COLOR = "UPDATE_COLOR";

export const MOODS = {
    SAD: "sad",
    HAPPY: "happy",
    SHOCKED: "shocked",
    BLISSFULL: "blissfull",
    EXCITED: "excited",
    KO: "ko",
    LOVESTRUCK: "lovestruck",
}

//initial state
const INITIAL_STATE = { 
    mood: MOODS.SAD,
    size: 320,
    color: "#596881"
};

//reducer
// export const moodReducer = (state = INITIAL_STATE, action) => {
//     console.log(action)
//     switch (action.type) {
//         case UPDATE_MOOD:
//             return { ...state, mood: action.payload }
//         default:
//             return state;
//     }
// }

//slice
export const catSlice = createSlice ({
    name: 'cat',
    initialState: INITIAL_STATE,
    reducers: {
        updateMood: (state, action) => {
            state.mood = action.payload;
        },
        addSize: (state) => (
            {...state, size: state.size+10} 
        ),
        decSize: (state) => (
            {...state, size: state.size-10} 
        ),
        updateColor: (state, action) => {
            state.color = action.payload
        },setMood: (state, action) => {
            return action.payload
        }
        }
})

export const { updateMood, addSize, decSize, updateColor } = catSlice.actions
export const moodReducer = catSlice.reducer