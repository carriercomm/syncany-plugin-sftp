/*
 * Syncany, www.syncany.org
 * Copyright (C) 2011-2014 Philipp C. Heckel <philipp.heckel@gmail.com> 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.syncany.plugins.sftp;

import org.syncany.plugins.Plugin;
import org.syncany.plugins.transfer.TransferManager;
import org.syncany.plugins.transfer.TransferPlugin;
import org.syncany.plugins.transfer.TransferSettings;

/**
 * Identifies the SFTP-based storage {@link Plugin} for Syncany. 
 * 
 * <p>This class defines the identifier, name and 
 * version of the plugin. It furthermore allows the instantiation 
 * of a plugin-specific {@link SftpTransferSettings}. 
 * 
 * @author Vincent Wiencek <vwiencek@gmail.com>
 */
public class SftpPlugin extends TransferPlugin {
	public SftpPlugin() {
		super("sftp");
	}

    @Override
    public TransferManager createTransferManager(TransferSettings connection) {
        return new SftpTransferManager((SftpTransferSettings) connection);
    }
    
	@Override
	public TransferSettings createSettings() {
		return new SftpTransferSettings();
	}
}