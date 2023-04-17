import { createSlice, PayloadAction } from '@reduxjs/toolkit'

//action type
export const UPDATE_MOOD = "UPDATE_MOOD";
export const UPDATE_SIZE = "UPDATE_SIZE";
export const UPDATE_COLOR = "UPDATE_COLOR";

//action creator
export const updateMood = (payload) => {
	return {
		type: UPDATE_MOOD,
		payload,
	};
};

export const updateSize = (payload) => {
	return {
		type: UPDATE_SIZE,
		payload,
	};
};

export const updateColor = (payload) => {
	return {
		type: UPDATE_COLOR,
		payload,
	};
};

export const MOODS = {
	SAD: "sad",
	HAPPY: "happy",
	SHOCKED: "shocked",
	BLISSFULL: "blissfull",
	EXCITED: "excited",
	KO: "ko",
	LOVESTRUCK: "lovestruck",
};

export const SIZE = {
    INIT: 320
}

export const COLOR = {
    INIT: "#596881"
}

//initial state
const INITIAL_STATE = {
	mood: MOODS.SAD,
	size: SIZE.INIT,
	color: COLOR.INIT,
};

//reducer
export const moodReducer = (state = INITIAL_STATE, action) => {
	console.log(action);
	switch (action.type) {
		case UPDATE_MOOD:
			return { ...state, mood: action.payload };
		default:
			return state;
	}
};

export const catSlice = createSlice ({
    name: 'cat',
    initialState: INITIAL_STATE,
    reducer: {
        updateMood
    }
})
