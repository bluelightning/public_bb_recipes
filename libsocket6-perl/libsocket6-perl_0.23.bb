DESCRIPTION = "Perl extensions for IPv6"
SECTION = "libs"
LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://README;md5=cfb4f6bcee0aa76f27c8b641ba40c4cc"
PR = "r0"

SRC_URI = "http://cpan.metacpan.org/authors/id/U/UM/UMEMOTO/Socket6-${PV}.tar.gz"
SRC_URI[md5sum] = "2c02adb13c449d48d232bb704ddbd492"
SRC_URI[sha256sum] = "eda753f0197e8c3c8d4ab20a634561ce84011fa51aa5ff40d4dbcb326ace0833"

S = "${WORKDIR}/Socket6-${PV}"

do_configure_prepend () {
#	oenote Executing autoreconf --verbose --install --force
	mkdir -p m4
	autoreconf -Wcross --verbose --install --force || oefatal "autoreconf execution failed."
	sed -i 's:\./configure\(.[^-]\):./configure --build=${BUILD_SYS} --host=${HOST_SYS} --target=${TARGET_SYS} --prefix=${prefix} --exec_prefix=${exec_prefix} --bindir=${bindir} --sbindir=${sbindir} --libexecdir=${libexecdir} --datadir=${datadir} --sysconfdir=${sysconfdir} --sharedstatedir=${sharedstatedir} --localstatedir=${localstatedir} --libdir=${libdir} --includedir=${includedir} --oldincludedir=${oldincludedir} --infodir=${infodir} --mandir=${mandir}\1:' Makefile.PL
}

CFLAGS += "-D_LARGEFILE_SOURCE -D_LARGEFILE64_SOURCE"
BUILD_CFLAGS += "-D_LARGEFILE_SOURCE -D_LARGEFILE64_SOURCE"

inherit cpan

BBCLASSEXTEND = "native"
