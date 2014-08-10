/****************************************************************************************
 * Copyright (c) 2013 Bibek Shrestha <bibekshrestha@gmail.com>                          *
 * Copyright (c) 2013 Zaur Molotnikov <qutorial@gmail.com>                              *
 * Copyright (c) 2013 Nicolas Raoul <nicolas.raoul@gmail.com>                           *
 * Copyright (c) 2013 Flavio Lerda <flerda@gmail.com>                                   *
 * Copyright (c) 2014 Attila Szasz <tilusnet@gmail.com>                                 *
 *                                                                                      *
 * This program is free software; you can redistribute it and/or modify it under        *
 * the terms of the GNU General Public License as published by the Free Software        *
 * Foundation; either version 3 of the License, or (at your option) any later           *
 * version.                                                                             *
 *                                                                                      *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY      *
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A      *
 * PARTICULAR PURPOSE. See the GNU General Public License for more details.             *
 *                                                                                      *
 * You should have received a copy of the GNU General Public License along with         *
 * this program.  If not, see <http://www.gnu.org/licenses/>.                           *
 ****************************************************************************************/

package com.ichi2.anki.multimediacard.language;

import android.content.Context;

import com.ichi2.anki.R;

public class LanguageListerCambridge extends LanguageListerBase {

    public LanguageListerCambridge(Context context) {
        super();

        addLanguage(context.getString(R.string.multimedia_editor_languages_british_english), "en_GB");
        addLanguage(context.getString(R.string.multimedia_editor_languages_american_english), "en_US");
        // Seems to have no pronunciation yet
        // addLanguage(context.getString(R.string.multimedia_editor_languages_portuguese), "pt-de");
    }
}
