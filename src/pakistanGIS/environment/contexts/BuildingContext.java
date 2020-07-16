/*
ęCopyright 2012 Nick Malleson
This file is part of RepastCity.

RepastCity is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

RepastCity is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with RepastCity.  If not, see <http://www.gnu.org/licenses/>.
*/

package pakistanGIS.environment.contexts;

import repast.simphony.context.DefaultContext;
import pakistanGIS.environment.Building;
import pakistanGIS.main.GlobalVars;


public class BuildingContext extends DefaultContext<Building> {
	
	public BuildingContext() {
		super(GlobalVars.CONTEXT_NAMES.BUILDING_CONTEXT);
	}

}
